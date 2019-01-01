$('.switch input[type="checkbox"]').on('change' , function() {
        var dText = (this.checked)? 'You want to activate the Product?': 'You want to de-activate the Product?';
        var checked = this.checked;
        var checkbox = $(this);
        bootbox.confirm({
            size: 'medium',
            title: 'Product Activation/Deactivation',
            message: dText,
            callback: function (confirmed) {
                if (confirmed) {
                    $.ajax({
                        type: 'POST',
                        url: window.contextRoot + '/manage/product/'+checkbox.prop('value')+'/activation',
                        timeout : 100000,
                        success : function(data) {
                            bootbox.alert(data);
                        },
                        error : function(e) {
                            bootbox.alert('ERROR: '+ e);
                            //display(e);
                        }
                    });
                }
                else {
                    checkbox.prop('checked', !checked);
                }
            }
        });
    });

$('.switch input[type="checkbox"]').on('change', function () {
    var checkbox = $(this);
    var checked = checkbox.prop('checked');
    var dMsg = (checked)? 'You want to activate the product':
        'You want to activate the product';
    var value = checkbox.prop('value');
    bootbox.confirm({
        size: 'medium',
        title: 'Product',
        massage: dMsg,
        callback: function(confirmed) {
            if(confirmed){
                console.log(value);
                bootbox.alert({
                    size: 'medium',
                    title:'Information',
                    message:'You are doing to preform operation on product'+ value
                });

            }
            else {
                checkbox.prop('checked',!checked);
            }

        }
    });
});