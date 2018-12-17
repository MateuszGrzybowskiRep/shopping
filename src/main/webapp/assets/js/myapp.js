<!-- /.col-lg-3 -->
$(function() {
    switch (menu) {
        case 'Conctact Us':
            $('#contact').addClass('active');
            break;
        case 'About Us':
            $('#about').addClass('active');
            break;
        default:
            $('#home').addClass('active');
            break;
    }
});