package tests.jenkins;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import settingsPerEnv.reportAutomation.pages.BuildPage;
import settingsPerEnv.reportAutomation.pages.LoginPage;
import settingsPerEnv.reportAutomation.pages.ProjectPage;
import settingsPerEnv.reportAutomation.pages.ScreamingFrogPage;
import common.services.Actions;
import settingsPerEnv.reportAutomation.services.Constants;
import settingsPerEnv.reportAutomation.services.CredService;
import settingsPerEnv.reportAutomation.services.UrlService;

import static common.settings.DriverInit.driver;

public class CheckLogTests {
    LoginPage loginPage = new LoginPage();
    private final int THRESHOLD = 30;
    @BeforeTest
    public void setUp()  {
        Actions.open(UrlService.BASIC_URL_JENKINS);
        loginPage.logInSystem(CredService.USERNAME, CredService.PASSWORD);
    }
    @Test
    public void checkAllValuesAreCorrect(){
        SoftAssert softAssert = new SoftAssert();
        new ScreamingFrogPage()
                .frogLink()
                .prodLinkClick();
        new ProjectPage().clickBuildLink();
        new BuildPage()
                .clickConsoleOutputButton()
                .clickFullLogButton();
        var prodServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PROD_URL_CASINO);
        var prodPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PROD_URL_CASINO);
        var prodTitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PROD_URL_CASINO);
        var prodTitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PROD_URL_CASINO);
        var prodMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PROD_URL_CASINO);
        var prodMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PROD_URL_CASINO);
        var prodH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PROD_URL_CASINO);
        var prodH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PROD_URL_CASINO);
        var prodH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PROD_URL_CASINO);

        softAssert.assertEquals(prodServerError,0, "500 on prod for "+UrlService.PROD_URL_CASINO);
        softAssert.assertEquals(prodTitleMissing,0,"missing title on prod for "+UrlService.PROD_URL_CASINO);
        softAssert.assertEquals(prodTitleDuplicate,0,"duplicate titles on prod for "+UrlService.PROD_URL_CASINO);
        softAssert.assertEquals(prodMetaMissing,0,"missing meta on prod for "+UrlService.PROD_URL_CASINO);
        softAssert.assertEquals(prodMetaDuplicate,0,"duplicate meta on prod for "+UrlService.PROD_URL_CASINO);
        softAssert.assertEquals(prodH1Missing,0, "missing H1 on prod for "+UrlService.PROD_URL_CASINO);
        softAssert.assertEquals(prodH1Duplicate,0,"duplicate H1 on prod for "+UrlService.PROD_URL_CASINO);
        softAssert.assertEquals(prodH2Missing,0,"missing H2 on prod for "+UrlService.PROD_URL_CASINO);

        var prodKServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PROD_URL_K_CASINO);
        var prodKPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PROD_URL_K_CASINO);
        var prodKTitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PROD_URL_K_CASINO);
        var prodKTitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PROD_URL_K_CASINO);
        var prodKMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PROD_URL_K_CASINO);
        var prodKMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PROD_URL_K_CASINO);
        var prodKH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PROD_URL_K_CASINO);
        var prodKH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PROD_URL_K_CASINO);
        var prodKH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PROD_URL_K_CASINO);

        softAssert.assertEquals(prodKServerError,0, "500 on prod for "+UrlService.PROD_URL_K_CASINO);
        softAssert.assertEquals(prodKTitleMissing,0,"missing title on prod for "+UrlService.PROD_URL_K_CASINO);
        softAssert.assertEquals(prodKTitleDuplicate,0,"duplicate titles on prod for "+UrlService.PROD_URL_K_CASINO);
        softAssert.assertEquals(prodKMetaMissing,0,"missing meta on prod for "+UrlService.PROD_URL_K_CASINO);
        softAssert.assertEquals(prodKMetaDuplicate,0,"duplicate meta on prod for "+UrlService.PROD_URL_K_CASINO);
        softAssert.assertEquals(prodKH1Missing,0, "missing H1 on prod for "+UrlService.PROD_URL_K_CASINO);
        softAssert.assertEquals(prodKH1Duplicate,0,"duplicate H1 on prod for "+UrlService.PROD_URL_K_CASINO);
        softAssert.assertEquals(prodKH2Missing,0,"missing H2 on prod for "+UrlService.PROD_URL_K_CASINO);

        var prodAUSServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PROD_URL_AUS_CASINO);
        var prodAUSPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PROD_URL_AUS_CASINO);
        var prodAUSTitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PROD_URL_AUS_CASINO);
        var prodAUSTitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PROD_URL_AUS_CASINO);
        var prodAUSMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PROD_URL_AUS_CASINO);
        var prodAUSMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PROD_URL_AUS_CASINO);
        var prodAUSH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PROD_URL_AUS_CASINO);
        var prodAUSH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PROD_URL_AUS_CASINO);
        var prodAUSH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PROD_URL_AUS_CASINO);

        softAssert.assertEquals(prodAUSServerError,0, "500 on prod for "+UrlService.PROD_URL_AUS_CASINO);
        softAssert.assertEquals(prodAUSTitleMissing,0,"missing title on prod for "+UrlService.PROD_URL_AUS_CASINO);
        softAssert.assertEquals(prodAUSTitleDuplicate,0,"duplicate titles on prod for "+UrlService.PROD_URL_AUS_CASINO);
        softAssert.assertEquals(prodAUSMetaMissing,0,"missing meta on prod for "+UrlService.PROD_URL_AUS_CASINO);
        softAssert.assertEquals(prodAUSMetaDuplicate,0,"duplicate meta on prod for "+UrlService.PROD_URL_AUS_CASINO);
        softAssert.assertEquals(prodAUSH1Missing,0, "missing H1 on prod for "+UrlService.PROD_URL_AUS_CASINO);
        softAssert.assertEquals(prodAUSH1Duplicate,0,"duplicate H1 on prod for "+UrlService.PROD_URL_AUS_CASINO);
        softAssert.assertEquals(prodAUSH2Missing,0,"missing H2 on prod for "+UrlService.PROD_URL_AUS_CASINO);

        var prodCAServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PROD_URL_CA_CASINO);
        var prodCAPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PROD_URL_CA_CASINO);
        var prodCATitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PROD_URL_CA_CASINO);
        var prodCATitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PROD_URL_CA_CASINO);
        var prodCAMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PROD_URL_CA_CASINO);
        var prodCAMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PROD_URL_CA_CASINO);
        var prodCAH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PROD_URL_CA_CASINO);
        var prodCAH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PROD_URL_CA_CASINO);
        var prodCAH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PROD_URL_CA_CASINO);

        softAssert.assertEquals(prodCAServerError,0, "500 on prod for "+UrlService.PROD_URL_CA_CASINO);
        softAssert.assertEquals(prodCATitleMissing,0,"missing title on prod for "+UrlService.PROD_URL_CA_CASINO);
        softAssert.assertEquals(prodCATitleDuplicate,0,"duplicate titles on prod for "+UrlService.PROD_URL_CA_CASINO);
        softAssert.assertEquals(prodCAMetaMissing,0,"missing meta on prod for "+UrlService.PROD_URL_CA_CASINO);
        softAssert.assertEquals(prodCAMetaDuplicate,0,"duplicate meta on prod for "+UrlService.PROD_URL_CA_CASINO);
        softAssert.assertEquals(prodCAH1Missing,0, "missing H1 on prod for "+UrlService.PROD_URL_CA_CASINO);
        softAssert.assertEquals(prodCAH1Duplicate,0,"duplicate H1 on prod for "+UrlService.PROD_URL_CA_CASINO);
        softAssert.assertEquals(prodCAH2Missing,0,"missing H2 on prod for "+UrlService.PROD_URL_CA_CASINO);

        var prodUKServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PROD_URL_UK_CASINO);
        var prodUKPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PROD_URL_UK_CASINO);
        var prodUKTitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PROD_URL_UK_CASINO);
        var prodUKTitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PROD_URL_UK_CASINO);
        var prodUKMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PROD_URL_UK_CASINO);
        var prodUKMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PROD_URL_UK_CASINO);
        var prodUKH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PROD_URL_UK_CASINO);
        var prodUKH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PROD_URL_UK_CASINO);
        var prodUKH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PROD_URL_UK_CASINO);

        softAssert.assertEquals(prodUKServerError,0, "500 on prod for "+UrlService.PROD_URL_UK_CASINO);
        softAssert.assertEquals(prodUKTitleMissing,0,"missing title on prod for "+UrlService.PROD_URL_UK_CASINO);
        softAssert.assertEquals(prodUKTitleDuplicate,0,"duplicate titles on prod for "+UrlService.PROD_URL_UK_CASINO);
        softAssert.assertEquals(prodUKMetaMissing,0,"missing meta on prod for "+UrlService.PROD_URL_UK_CASINO);
        softAssert.assertEquals(prodUKMetaDuplicate,0,"duplicate meta on prod for "+UrlService.PROD_URL_UK_CASINO);
        softAssert.assertEquals(prodUKH1Missing,0, "missing H1 on prod for "+UrlService.PROD_URL_UK_CASINO);
        softAssert.assertEquals(prodUKH1Duplicate,0,"duplicate H1 on prod for "+UrlService.PROD_URL_UK_CASINO);
        softAssert.assertEquals(prodUKH2Missing,0,"missing H2 on prod for "+UrlService.PROD_URL_UK_CASINO);

        var prodNZServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PROD_URL_NZ_CASINO);
        var prodNZPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PROD_URL_NZ_CASINO);
        var prodNZTitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PROD_URL_NZ_CASINO);
        var prodNZTitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PROD_URL_NZ_CASINO);
        var prodNZMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PROD_URL_NZ_CASINO);
        var prodNZMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PROD_URL_NZ_CASINO);
        var prodNZH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PROD_URL_NZ_CASINO);
        var prodNZH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PROD_URL_NZ_CASINO);
        var prodNZH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PROD_URL_NZ_CASINO);

        softAssert.assertEquals(prodNZServerError,0, "500 on prod for "+UrlService.PROD_URL_NZ_CASINO);
        softAssert.assertEquals(prodNZTitleMissing,0,"missing title on prod for "+UrlService.PROD_URL_NZ_CASINO);
        softAssert.assertEquals(prodNZTitleDuplicate,0,"duplicate titles on prod for "+UrlService.PROD_URL_NZ_CASINO);
        softAssert.assertEquals(prodNZMetaMissing,0,"missing meta on prod for "+UrlService.PROD_URL_NZ_CASINO);
        softAssert.assertEquals(prodNZMetaDuplicate,0,"duplicate meta on prod for "+UrlService.PROD_URL_NZ_CASINO);
        softAssert.assertEquals(prodNZH1Missing,0, "missing H1 on prod for "+UrlService.PROD_URL_NZ_CASINO);
        softAssert.assertEquals(prodNZH1Duplicate,0,"duplicate H1 on prod for "+UrlService.PROD_URL_NZ_CASINO);
        softAssert.assertEquals(prodNZH2Missing,0,"missing H2 on prod for "+UrlService.PROD_URL_NZ_CASINO);


        Actions.navigateBack();
        Actions.navigateBack();
        Actions.navigateBack();

        new ScreamingFrogPage().preprodLinkClick();
        new ProjectPage().clickBuildLink();
        new BuildPage()
                .clickConsoleOutputButton()
                .clickFullLogButton();

        var preProdServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PREPOD_URL_CASINO);
        var preProdPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PREPOD_URL_CASINO);
        var preProdTitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PREPOD_URL_CASINO);
        var preProdTitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PREPOD_URL_CASINO);
        var preProdMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PREPOD_URL_CASINO);
        var preProdMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PREPOD_URL_CASINO);
        var preProdH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PREPOD_URL_CASINO);
        var preProdH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PREPOD_URL_CASINO);
        var preProdH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PREPOD_URL_CASINO);

        softAssert.assertEquals(preProdServerError,0, "500 on preProd for "+UrlService.PREPOD_URL_CASINO);
        softAssert.assertEquals(preProdTitleMissing,0,"missing title on preProd for "+UrlService.PREPOD_URL_CASINO);
        softAssert.assertEquals(preProdTitleDuplicate,0,"duplicate titles on preProd for "+UrlService.PREPOD_URL_CASINO);
        softAssert.assertEquals(preProdMetaMissing,0,"missing meta on preProd for "+UrlService.PREPOD_URL_CASINO);
        softAssert.assertEquals(preProdMetaDuplicate,0,"duplicate meta on preProd for "+UrlService.PREPOD_URL_CASINO);
        softAssert.assertEquals(preProdH1Missing,0,"missing H1 on preProd for "+UrlService.PREPOD_URL_CASINO);
        softAssert.assertEquals(preProdH1Duplicate,0,"duplicate H1 on preProd for "+UrlService.PREPOD_URL_CASINO);
        softAssert.assertEquals(preProdH2Missing,0,"missing H2 on preProd for "+UrlService.PREPOD_URL_CASINO);

        var preProdKServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PREPOD_URL_K_CASINO);
        var preProdKPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PREPOD_URL_K_CASINO);
        var preProdKTitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PREPOD_URL_K_CASINO);
        var preProdKTitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PREPOD_URL_K_CASINO);
        var preProdKMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PREPOD_URL_K_CASINO);
        var preProdKMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PREPOD_URL_K_CASINO);
        var preProdKH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PREPOD_URL_K_CASINO);
        var preProdKH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PREPOD_URL_K_CASINO);
        var preProdKH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PREPOD_URL_K_CASINO);

        softAssert.assertEquals(preProdKServerError,0, "500 on preProd for "+UrlService.PREPOD_URL_K_CASINO);
        softAssert.assertEquals(preProdKTitleMissing,0,"missing title on preProd for "+UrlService.PREPOD_URL_K_CASINO);
        softAssert.assertEquals(preProdKTitleDuplicate,0,"duplicate titles on preProd for "+UrlService.PREPOD_URL_K_CASINO);
        softAssert.assertEquals(preProdKMetaMissing,0,"missing meta on preProd for "+UrlService.PREPOD_URL_K_CASINO);
        softAssert.assertEquals(preProdKMetaDuplicate,0,"duplicate meta on preProd for "+UrlService.PREPOD_URL_K_CASINO);
        softAssert.assertEquals(preProdKH1Missing,0,"missing H1 on preProd for "+UrlService.PREPOD_URL_K_CASINO);
        softAssert.assertEquals(preProdKH1Duplicate,0,"duplicate H1 on preProd for "+UrlService.PREPOD_URL_K_CASINO);
        softAssert.assertEquals(preProdKH2Missing,0,"missing H2 on preProd for "+UrlService.PREPOD_URL_K_CASINO);

        var preProdAUSServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PREPOD_URL_AUS_CASINO);
        var preProdAUSPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PREPOD_URL_AUS_CASINO);
        var preProdAUSTitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PREPOD_URL_AUS_CASINO);
        var preProdAUSTitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PREPOD_URL_AUS_CASINO);
        var preProdAUSMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PREPOD_URL_AUS_CASINO);
        var preProdAUSMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PREPOD_URL_AUS_CASINO);
        var preProdAUSH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PREPOD_URL_AUS_CASINO);
        var preProdAUSH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PREPOD_URL_AUS_CASINO);
        var preProdAUSH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PREPOD_URL_AUS_CASINO);

        softAssert.assertEquals(preProdAUSServerError,0, "500 on preProd for "+UrlService.PREPOD_URL_AUS_CASINO);
        softAssert.assertEquals(preProdAUSTitleMissing,0,"missing title on preProd for "+UrlService.PREPOD_URL_AUS_CASINO);
        softAssert.assertEquals(preProdAUSTitleDuplicate,0,"duplicate titles on preProd for "+UrlService.PREPOD_URL_AUS_CASINO);
        softAssert.assertEquals(preProdAUSMetaMissing,0,"missing meta on preProd for "+UrlService.PREPOD_URL_AUS_CASINO);
        softAssert.assertEquals(preProdAUSMetaDuplicate,0,"duplicate meta on preProd for "+UrlService.PREPOD_URL_AUS_CASINO);
        softAssert.assertEquals(preProdAUSH1Missing,0,"missing H1 on preProd for "+UrlService.PREPOD_URL_AUS_CASINO);
        softAssert.assertEquals(preProdAUSH1Duplicate,0,"duplicate H1 on preProd for "+UrlService.PREPOD_URL_AUS_CASINO);
        softAssert.assertEquals(preProdAUSH2Missing,0,"missing H2 on preProd for "+UrlService.PREPOD_URL_AUS_CASINO);

        var preProdCAServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PREPOD_URL_CA_CASINO);
        var preProdCAPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PREPOD_URL_CA_CASINO);
        var preProdCATitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PREPOD_URL_CA_CASINO);
        var preProdCATitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PREPOD_URL_CA_CASINO);
        var preProdCAMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PREPOD_URL_CA_CASINO);
        var preProdCAMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PREPOD_URL_CA_CASINO);
        var preProdCAH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PREPOD_URL_CA_CASINO);
        var preProdCAH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PREPOD_URL_CA_CASINO);
        var preProdCAH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PREPOD_URL_CA_CASINO);

        softAssert.assertEquals(preProdCAServerError,0, "500 on preProd for "+UrlService.PREPOD_URL_CA_CASINO);
        softAssert.assertEquals(preProdCATitleMissing,0,"missing title on preProd for "+UrlService.PREPOD_URL_CA_CASINO);
        softAssert.assertEquals(preProdCATitleDuplicate,0,"duplicate titles on preProd for "+UrlService.PREPOD_URL_CA_CASINO);
        softAssert.assertEquals(preProdCAMetaMissing,0,"missing meta on preProd for "+UrlService.PREPOD_URL_CA_CASINO);
        softAssert.assertEquals(preProdCAMetaDuplicate,0,"duplicate meta on preProd for "+UrlService.PREPOD_URL_CA_CASINO);
        softAssert.assertEquals(preProdCAH1Missing,0,"missing H1 on preProd for "+UrlService.PREPOD_URL_CA_CASINO);
        softAssert.assertEquals(preProdCAH1Duplicate,0,"duplicate H1 on preProd for "+UrlService.PREPOD_URL_CA_CASINO);
        softAssert.assertEquals(preProdCAH2Missing,0,"missing H2 on preProd for "+UrlService.PREPOD_URL_CA_CASINO);

        var preProdUKServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PREPOD_URL_UK_CASINO);
        var preProdUKPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PREPOD_URL_UK_CASINO);
        var preProdUKTitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PREPOD_URL_UK_CASINO);
        var preProdUKTitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PREPOD_URL_UK_CASINO);
        var preProdUKMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PREPOD_URL_UK_CASINO);
        var preProdUKMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PREPOD_URL_UK_CASINO);
        var preProdUKH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PREPOD_URL_UK_CASINO);
        var preProdUKH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PREPOD_URL_UK_CASINO);
        var preProdUKH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PREPOD_URL_UK_CASINO);

        softAssert.assertEquals(preProdUKServerError,0, "500 on preProd for "+UrlService.PREPOD_URL_UK_CASINO);
        softAssert.assertEquals(preProdUKTitleMissing,0,"missing title on preProd for "+UrlService.PREPOD_URL_UK_CASINO);
        softAssert.assertEquals(preProdUKTitleDuplicate,0,"duplicate titles on preProd for "+UrlService.PREPOD_URL_UK_CASINO);
        softAssert.assertEquals(preProdUKMetaMissing,0,"missing meta on preProd for "+UrlService.PREPOD_URL_UK_CASINO);
        softAssert.assertEquals(preProdUKMetaDuplicate,0,"duplicate meta on preProd for "+UrlService.PREPOD_URL_UK_CASINO);
        softAssert.assertEquals(preProdUKH1Missing,0,"missing H1 on preProd for "+UrlService.PREPOD_URL_UK_CASINO);
        softAssert.assertEquals(preProdUKH1Duplicate,0,"duplicate H1 on preProd for "+UrlService.PREPOD_URL_UK_CASINO);
        softAssert.assertEquals(preProdUKH2Missing,0,"missing H2 on preProd for "+UrlService.PREPOD_URL_UK_CASINO);

        var preProdNZServerError = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_500, UrlService.PREPOD_URL_NZ_CASINO);
        var preProdNZPages = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_PAGES, UrlService.PREPOD_URL_NZ_CASINO);
        var preProdNZTitleMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_MISSING, UrlService.PREPOD_URL_NZ_CASINO);
        var preProdNZTitleDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_TITLE_DUPLICATE, UrlService.PREPOD_URL_NZ_CASINO);
        var preProdNZMetaMissing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_MISSING, UrlService.PREPOD_URL_NZ_CASINO);
        var preProdNZMetaDuplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_META_DUPLICATE, UrlService.PREPOD_URL_NZ_CASINO);
        var preProdNZH1Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_MISSING, UrlService.PREPOD_URL_NZ_CASINO);
        var preProdNZH1Duplicate = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H1_DUPLICATE, UrlService.PREPOD_URL_NZ_CASINO);
        var preProdNZH2Missing = Actions.retrieveNumberFromPage(Constants.REGEX_FOR_H2_MISSING, UrlService.PREPOD_URL_NZ_CASINO);

        softAssert.assertEquals(preProdNZServerError,0, "500 on preProd for "+UrlService.PREPOD_URL_NZ_CASINO);
        softAssert.assertEquals(preProdNZTitleMissing,0,"missing title on preProd for "+UrlService.PREPOD_URL_NZ_CASINO);
        softAssert.assertEquals(preProdNZTitleDuplicate,0,"duplicate titles on preProd for "+UrlService.PREPOD_URL_NZ_CASINO);
        softAssert.assertEquals(preProdNZMetaMissing,0,"missing meta on preProd for "+UrlService.PREPOD_URL_NZ_CASINO);
        softAssert.assertEquals(preProdNZMetaDuplicate,0,"duplicate meta on preProd for "+UrlService.PREPOD_URL_NZ_CASINO);
        softAssert.assertEquals(preProdNZH1Missing,0,"missing H1 on preProd for "+UrlService.PREPOD_URL_NZ_CASINO);
        softAssert.assertEquals(preProdNZH1Duplicate,0,"duplicate H1 on preProd for "+UrlService.PREPOD_URL_NZ_CASINO);
        softAssert.assertEquals(preProdNZH2Missing,0,"missing H2 on preProd for "+UrlService.PREPOD_URL_NZ_CASINO);

        softAssert.assertTrue(Actions.areApproximatelyEqual(prodPages,preProdPages, THRESHOLD ),
                "there is a big difference between amount of pages on prod and preProd for " + UrlService.PROD_URL_CASINO);
        softAssert.assertTrue(Actions.areApproximatelyEqual(prodKPages,preProdKPages, THRESHOLD ),
                "there is a big difference between amount of pages on prod and preProd for " + UrlService.PROD_URL_K_CASINO);
        softAssert.assertTrue(Actions.areApproximatelyEqual(prodAUSPages,preProdAUSPages, THRESHOLD ),
                "there is a big difference between amount of pages on prod and preProd for " + UrlService.PROD_URL_AUS_CASINO);
        softAssert.assertTrue(Actions.areApproximatelyEqual(prodCAPages,preProdCAPages, THRESHOLD ),
                "there is a big difference between amount of pages on prod and preProd for " + UrlService.PROD_URL_CA_CASINO);
        softAssert.assertTrue(Actions.areApproximatelyEqual(prodUKPages,preProdUKPages, THRESHOLD ),
                "there is a big difference between amount of pages on prod and preProd for " + UrlService.PROD_URL_UK_CASINO);
        softAssert.assertTrue(Actions.areApproximatelyEqual(prodNZPages,preProdNZPages, THRESHOLD ),
                "there is a big difference between amount of pages on prod and preProd for " + UrlService.PROD_URL_NZ_CASINO);
        softAssert.assertAll();
    }

        @AfterTest
    public void tearDown(){
        if(driver!=null) {
            driver.quit();
        }
    }

}
