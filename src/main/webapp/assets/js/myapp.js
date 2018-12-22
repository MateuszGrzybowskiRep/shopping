<!-- /.col-lg-3 -->
$(function() {
    switch (menu) {

        case 'About Us':
            $('#about').addClass('active');
            break;

        case 'Conctact Us':
            $('#contact').addClass('active');
            break;

        case 'All Products':
            $('#listProducts').addClass('active');
            break;

        default:
            if(menu == "Home")break;
            $('#listProducts').addClass('active');
            $('#a_'+menu).addClass('active');
            break;
    }
});