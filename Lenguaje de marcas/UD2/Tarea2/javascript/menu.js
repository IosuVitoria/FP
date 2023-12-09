document.addEventListener('DOMContentLoaded', function () {
    const mobileMenuButton = document.getElementById('mobile-menu');
    const hoverMenuButton = document.getElementById('hover-menu');
    const navList = document.querySelector('.header__content__nav');

    mobileMenuButton.addEventListener('click', function (e) {
      e.stopPropagation();
      navList.classList.toggle('show');
    });

    hoverMenuButton.addEventListener('click', function (e) {
      e.stopPropagation(); 
      navList.classList.toggle('show');
    });

    document.addEventListener('click', function () {
      navList.classList.remove('show');
    });

    navList.addEventListener('click', function (e) {
      e.stopPropagation();
    });
});