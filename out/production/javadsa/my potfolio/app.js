function toggleMenu() {
    // Selects the element with the class "hamburger-icon"
    const menu = document.querySelector(".hamburger-icon");
    
    // Selects the element with the class "menu-link"
    const icon = document.querySelector(".menu-link");
    
    // Toggles the class "open" on the menu element (hamburger-icon)
    menu.classList.toggle("open");
    
    // Toggles the class "open" on the icon element (menu-link)
    icon.classList.toggle("open");
}
