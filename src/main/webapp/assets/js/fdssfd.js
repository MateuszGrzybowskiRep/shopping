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
