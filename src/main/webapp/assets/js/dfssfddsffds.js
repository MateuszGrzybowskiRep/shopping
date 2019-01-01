
var $table = $('#productListTable');
if($table.length) {
    var jsonUrl = '';
    jsonUrl = window.contextRoot + '/json/data/all/products';

    $table.DataTable( {
        lengthMenu: [[3,5,10,-1], ['3 Records', '5 Records', '10 Records', 'ALL']],
        pageLength: 5,
        ajax: {
            url: jsonUrl,
            dataSrc: ''
        },
        columns: [
            {
                data: 'code'
            },
            {
                data: 'name'
            },
            {
                data: 'brand'
            },
            {
                data: 'unitPrice'
            },
            {
                data: 'quantity'
            },
            {
                data: 'id'

            }
        ]
    });

}