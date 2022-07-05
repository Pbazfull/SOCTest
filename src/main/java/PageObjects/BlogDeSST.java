package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BlogDeSST {
    private WebDriver driver;

    @FindBy(how = How.CSS, using = "header.elementor-section.elementor-top-section.elementor-element.elementor-section-content-middle.elementor-section-full_width.elementor-section-height-default.exad-glass-effect-no.exad-sticky-section-no.elementor-sticky.elementor-sticky--active.elementor-section--handles-inside.elementor-sticky--effects > div > div > div > div > div > section:nth-child(2) > div > div > div > div > div > div.elementor-element.elementor-widget__width-auto.elementor-hidden-phone.elementor-nav-menu--dropdown-mobile.elementor-nav-menu__text-align-aside.exad-sticky-section-no.exad-glass-effect-no.elementor-widget.elementor-widget-nav-menu > div > nav.elementor-nav-menu--main.elementor-nav-menu__container.elementor-nav-menu--layout-horizontal.e--pointer-underline.e--animation-fade > ul > li:nth-child(2) > a")
    private WebElement MenuDropdown;

    @FindBy(how = How.CSS,using = "header.elementor-section.elementor-top-section.elementor-element.elementor-section-content-middle.elementor-section-full_width.elementor-section-height-default.exad-glass-effect-no.exad-sticky-section-no.elementor-sticky.elementor-sticky--active.elementor-section--handles-inside.elementor-sticky--effects > div > div > div > div > div > section:nth-child(2) > div > div > div > div > div > div.elementor-element.elementor-widget__width-auto.elementor-hidden-phone.elementor-nav-menu--dropdown-mobile.elementor-nav-menu__text-align-aside.exad-sticky-section-no.exad-glass-effect-no.elementor-widget.elementor-widget-nav-menu > div > nav.elementor-nav-menu--main.elementor-nav-menu__container.elementor-nav-menu--layout-horizontal.e--pointer-underline.e--animation-fade > ul > li:nth-child(2) > ul > li.menu-item.menu-item-type-post_type.menu-item-object-page.menu-item-294 > a")
    private WebElement BtnRedeSOCNET;

    public BlogDeSST(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void IrParaRedeCredenciadaSOCNET()
    {
        MenuDropdown.click();
        BtnRedeSOCNET.click();
    }
}



