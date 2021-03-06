


$(function() {
    // solving the active menu problem
    switch(menu) {

        case 'About Us':
            $('#about').addClass('active');
            break;
        case 'Conctact Us':
            $('#contact').addClass('active');
            break;
        case 'All Products':
            $('#listProducts').addClass('active');
            break;
        case 'Manage Product':
            $('#manageProducts').addClass('active');
            break;

        default:
            if(menu == "Home") break;
            $('#listProducts').addClass('active');
            $('#a_'+menu).addClass('active');
            break;
    }


    // code for jquery dataTable


    var $table = $('#productListTable');

    // execute the below code only where we have this table
    if($table.length) {
        //console.log('Inside the table!');

        var jsonUrl = '';
        if(window.categoryId == '') {
            jsonUrl = window.contextRoot + '/json/data/all/products';
        }
        else {
            jsonUrl = window.contextRoot + '/json/data/category/'+ window.categoryId +'/products';
        }



        $table.DataTable( {

            lengthMenu: [[3,5,10,-1], ['3 Records', '5 Records', '10 Records', 'ALL']],
            pageLength: 5,
            ajax: {
                url: jsonUrl,
                dataSrc: ''
            },
            columns: [
                {
                    data: 'code',
                    bSortable: false,
                    mRender: function(data, type, row) {

                        return '<img src="'+window.contextRoot+'/resources/images/'+data+'.jpg" class="dataTableImg"/>';

                    }
                },
                {
                    data: 'name'
                },
                {
                    data: 'brand'
                },
                {
                    data: 'unitPrice',
                    mRender: function(data, type, row) {
                        return '&#8377; ' + data
                    }
                },
                {
                    data: 'quantity'
                },
                {
                    data: 'id',
                    bSortable: false,
                    mRender: function(data, type, row) {

                        var str = '';
                        str += '<a href="'+window.contextRoot+ '/show/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';
                        str += '<a href="'+window.contextRoot+ '/cart/add/'+data+'/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>';

                        return str;

                    }

                }
            ]
        });
        var $aler =$('.alert');
        if($alert.length){
            setTimeout(function () {
                $alert.fadeOut('slow');
            },3000)
        }

    }
//new

    var $adminProductsTable = $('#adminProductsTable');
    if($adminProductsTable.length) {
        var jsonUrl = '';
        jsonUrl = window.contextRoot + '/json/data/all/products';

        $adminProductsTable.DataTable( {
            lengthMenu: [[3,5,10,-1], ['3 Records', '5 Records', '10 Records', 'ALL']],
            pageLength: 5,
            ajax: {
                url: jsonUrl,
                dataSrc: ''
            },
            columns: [
                {
                    data: 'id'

                },
                {
                    data: 'code',
                    bSortable: false,
                    mRender: function (data, type, row) {

                        return '<img src="' + window.contextRoot + '/resources/images/' + data + '.jpg" class="adminDataTableImg"/>';

                    }
                },
                {
                    data: 'name'
                },
                {
                    data: 'brand'
                },
                {
                    data: 'quantity',
                    mRender: function (data, type, row) {
                        if (data < 1) {
                            return '<span style="color:red">Out of Stock!</span>';
                        }
                        return data;

                    }
                },
                {
                    data: 'unitPrice',
                    mRender: function (data, type, row) {
                        return '&#8377; ' + data
                    }
                },
                {
                    data: 'active',
                    bSortable: false,
                    mRender: function (data, type, row) {
                        var str = '<label class="switch">';
                        if (data) {
                            str += ' <input type="checkbox" checked="checked" value="' + row.id + '" />';

                        } else {
                            str += '<input type="checkbox" value="' + row.id + '" />';
                        }
                        str += ' <div class="slider"> </div></label>';

                        return str;
                    }
                },
                {
                    data: 'id',
                    bSortable: false,
                    mRender: function (data, type, row) {

                        var str = '';
                        str += '<a href="'+window.contextRoot+'/manage/'+data+'/product" class="btn btn-warning">';
                        str += '<span class="glyphicon glyphicon-pencil"></span></a>';

                        return str;
                    }
                }

            ],
            initComplete: function () {
                var api = this.api();
                api.$('.switch input[type="checkbox"]').on('change' , function() {
                    var checkbox = $(this);
                    var checked = checkbox.prop('checked');
                    var dMsg = (this.checked)? 'You want to activate the Product?':
                        'You want to de-activate the Product?';
                    var value = checkbox.prop('value');
                    bootbox.confirm({
                        size: 'medium',
                        title: 'Product Activation/Deactivation',
                        message: dMsg,
                        callback: function(confirmed) {
                            if(confirmed){
                                var activationUrl = window.contextRoot + '/manage/product/'+ value + '/activation';

                                $.post(activationUrl, function (data) {
                                    bootbox.alert({
                                        title: 'Information',
                                        size: 'medium',
                                        message: data
                                    });
                                });
                            }
                            else {
                                checkbox.prop('checked',!checked);
                            }

                        }
                    });
                });


            }
        });

    }
    //validation category
    var $categoryForm = $('#categoryForm');

    if($categoryForm.length){
        $categoryForm.validate({

            rules : {
                name :{
                    required: true

                },
                description: {
                    required: true
                }
            },

            messages :{
                name :{
                    required: 'Please add the category',
                    minlength: 'Please add the category'
                },
                description: {
                    required: 'Please add description for this category!'
                }
            },
            errrorElement: 'em',
            errorPlacement: function (error , elemrnt) {
                error.addClass('help-block');
                error.insertAfter(elemrnt);
            }
        });
    }


});