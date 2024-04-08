package com.kruger.ui.web.pages.inversion.newProject;

import com.kruger.config.selenium.UIMethods;
import com.kruger.constants.XpathText;
import com.kruger.entitys.LogicFrameData;
import com.kruger.ui.web.components.tabBars.LogicFrameMatrixMainTabBar;
import com.kruger.ui.web.components.tabBars.LogicFrameMatrixSecondaryTabBar;
import com.kruger.ui.web.sections.BaseLineSection;
import com.kruger.ui.web.sections.FinancingSourcesSection;
import com.kruger.ui.web.sections.IndicatorsSection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * LogicFramePage class represents the page for managing logic frames in a project.
 * It extends the BaseProjectPage class and provides methods to interact with various elements of the logic frame page.
 */
public class LogicFramePage extends BaseProjectPage {
    private static final String PLUS_ICON_BUTTON_XPATH = "//textarea[@id='%s']/ancestor::div[@class='p-fluid grid formgrid justify-content-center']/descendant::button";
    private static final String CONFIGURE_BASE_LINE_XPATH = "//tr[td='%s']//descendant::button//span[contains(@class,'pencil')]";
    private static final String SELECT_FROM_TABLE_XPATH = "//td[text()='%s']";
    @FindBy(xpath = "//span[contains(text(),'Problemas')]")
    WebElement problemTreeLabel;
    @FindBy(id = "problemaCentral")
    WebElement coreProblemTextBox;
    @FindBy(xpath = "//td[span='Causa']/preceding-sibling::td/button")
    WebElement showEffectsButton;
    @FindBy(id = "objetivoGeneral")
    WebElement generalObjectiveTextBox;
    @FindBy(xpath = "//td[span='Componente']/preceding-sibling::td/button")
    WebElement showActivitiesButton;
    @FindBy(id = "fin")
    WebElement endProjectTextBox;
    @FindBy(id = "finDetalle")
    WebElement endDetailsProjectTextBox;
    @FindBy(id = "finIndicadores")
    WebElement endIndicatorsTextBox;
    @FindBy(id = "finMediosVerificacion")
    WebElement verificationMethodsTextBox;
    @FindBy(id = "finSupuestos")
    WebElement endAssumptionsTextBox;
    @FindBy(id = "proposito")
    WebElement purposeTextBox;
    @FindBy(id = "propositoDetalle")
    WebElement purposeDetailTextBox;
    @FindBy(id = "propositoIndicadores")
    WebElement purposeIndicatorsTextBox;
    @FindBy(id = "propositoMediosVerificacion")
    WebElement purposeVerificationMethodsTextBox;
    @FindBy(id = "propositoSupuestos")
    WebElement purposeAssumptionsTextBox;
    @FindBy(id = "componenteDetalle")
    WebElement componentDetailTextBox;
    @FindBy(id = "actividadDetalle")
    WebElement activityDetailTextBox;
    @FindBy(xpath = "//div[contains(text(), 'componente')]/following-sibling::button")
    WebElement addIndicatorButton;
    @FindBy(xpath = "//*[@class='p-progress-spinner-svg']")
    WebElement progressSpinnerIcon;


    public LogicFramePage() {
        PageFactory.initElements(driver, this);
        waitUntilPageObjectIsLoaded();
    }

    @Override
    public void waitUntilPageObjectIsLoaded() {
        problemTreeLabel = driverWait.until(ExpectedConditions.visibilityOf(problemTreeLabel));
    }

    private void setCoreProblem(String problem) {
        UIMethods.enterText(coreProblemTextBox, problem);
    }

    private void clickOnAddCauseButton() {
        clickOnButton(XpathText.ADD_CAUSE_BUTTON.getText());
    }

    private void setCause(String cause) {
        setTextBox(XpathText.CAUSE_TEXT_BOX.getText(), cause);
    }

    private void clickOnAddEffectButton() {
        clickOnButton(XpathText.ADD_EFFECT_BUTTON.getText());
    }

    private void setEffect(String effect) {
        setTextBox(XpathText.EFFECT_TEXT_BOX.getText(), effect);
    }

    private void setGeneralObjective(String generalObjective) {
        UIMethods.enterText(generalObjectiveTextBox, generalObjective);
    }

    private void clickOnAddComponentButton() {
        clickOnButton(XpathText.ADD_COMPONENT_BUTTON.getText());
    }

    private void setComponent(String component) {
        setTextBox(XpathText.COMPONENT_TEXT_BOX.getText(), component);
    }

    private void clickOnAddActivityButton() {
        clickOnButton(XpathText.ADD_ACTIVITY_BUTTON.getText());
    }

    private void setActivity(String activity) {
        setTextBox(XpathText.ACTIVITY_TEXT_BOX.getText(), activity);
    }

    private void setEndOfProject(String endProject) {
        UIMethods.enterText(endProjectTextBox, endProject);
    }

    private void setEndDetails(String endDetails) {
        UIMethods.enterText(endDetailsProjectTextBox, endDetails);
    }

    private void setEndIndicators(String endIndicators) {
        UIMethods.enterText(endIndicatorsTextBox, endIndicators);
    }

    private void clickOnPlusButton(String textBoxId) {
        WebElement plusButton = UIMethods.getElementFromDynamicXpath(PLUS_ICON_BUTTON_XPATH, textBoxId);
        UIMethods.clickOnElement(plusButton);
    }

    private void clickOnEndIndicatorsPlusButton() {
        clickOnPlusButton(XpathText.END_INDICATORS_PLUS_BUTTON.getText());
    }

    private void setVerificationMethods(String verificationMethods) {
        UIMethods.enterText(verificationMethodsTextBox, verificationMethods);
    }

    private void clickOnEndVerificationMethodsPlusButton() {
        clickOnPlusButton(XpathText.END_VERIFICATION_METHODS_PLUS_BUTTON.getText());
    }

    private void setEndAssumptionsTextBox(String endAssumptions) {
        UIMethods.enterText(endAssumptionsTextBox, endAssumptions);
    }

    private void clickOnEndAssumptionsPlusButton() {
        clickOnPlusButton(XpathText.END_ASSUMPTIONS_PLUS_BUTTON.getText());
    }

    private void setProjectPurpose(String purpose) {
        UIMethods.enterText(purposeTextBox, purpose);
    }

    private void setPurposeDetails(String purposeDetails) {
        UIMethods.enterText(purposeDetailTextBox, purposeDetails);
    }

    private void setPurposeIndicators(String purposeIndicators) {
        UIMethods.enterText(purposeIndicatorsTextBox, purposeIndicators);
    }

    private void clickOnPurposeIndicatorsPlusButton() {
        clickOnPlusButton(XpathText.PURPOSE_INDICATORS_PLUS_BUTTON.getText());
    }

    private BaseLineSection clickOnConfigureBaseLineButton(String indicatorName) {
        WebElement configureBaseLineButton = UIMethods.getElementFromDynamicXpath(CONFIGURE_BASE_LINE_XPATH, indicatorName);
        UIMethods.clickOnElement(configureBaseLineButton);
        return new BaseLineSection();
    }

    private void setPurposeVerificationMethods(String purposeVerificationMethods) {
        UIMethods.enterText(purposeVerificationMethodsTextBox, purposeVerificationMethods);
    }

    private void clickOnPurposeVerificationMethodsPlusButton() {
        clickOnPlusButton(XpathText.PURPOSE_VERIFICATION_METHODS_PLUS_BUTTON.getText());
    }

    private void setPurposeAssumptions(String purposeAssumptions) {
        UIMethods.enterText(purposeAssumptionsTextBox, purposeAssumptions);
    }

    private void clickOnPurposeAssumptionsPlusButton() {
        clickOnPlusButton(XpathText.PURPOSE_ASSUMPTIONS_PLUS_BUTTON.getText());
    }

    private void clickOnComponent(String componentName) {
        WebElement component = UIMethods.getElementFromDynamicXpath(SELECT_FROM_TABLE_XPATH, componentName);
        UIMethods.clickOnElement(component);
    }

    private void setComponentDetail(String componentDetail) {
        UIMethods.enterText(componentDetailTextBox, componentDetail);
    }

    private void clickOnActivity(String activityName) {
        WebElement activity = UIMethods.getElementFromDynamicXpath(SELECT_FROM_TABLE_XPATH, activityName);
        UIMethods.clickOnElement(activity);
    }

    private void setActivityDetail(String activityDetail) {
        UIMethods.enterText(activityDetailTextBox, activityDetail);
    }

    private IndicatorsSection clickOnAddIndicatorButton() {
        UIMethods.clickOnElement(addIndicatorButton);
        return new IndicatorsSection();
    }

    private void navigateToPurposeTab() {
        LogicFrameMatrixMainTabBar mainTabBar = new LogicFrameMatrixMainTabBar();
        mainTabBar.clickOnPurposeTab();
    }

    private void navigateToComponentsTab() {
        LogicFrameMatrixMainTabBar mainTabBar = new LogicFrameMatrixMainTabBar();
        mainTabBar.clickOnComponentsTab();
    }

    private void navigateToVerificationMethodsTab() {
        LogicFrameMatrixSecondaryTabBar tabBar = new LogicFrameMatrixSecondaryTabBar();
        tabBar.clickOnVerificationMethodsTab();
    }

    private void navigateToAssumptionsTab() {
        LogicFrameMatrixSecondaryTabBar tabBar = new LogicFrameMatrixSecondaryTabBar();
        tabBar.clickOnAssumptionsTab();
    }

    private void navigateToSecondAssumptionsTab() {
        LogicFrameMatrixSecondaryTabBar tabBar = new LogicFrameMatrixSecondaryTabBar();
        tabBar.clickOnSecondAssumptionsTab();
    }

    private void navigateToActivitiesTab() {
        LogicFrameMatrixSecondaryTabBar tabBar = new LogicFrameMatrixSecondaryTabBar();
        tabBar.clickOnActivitiesTab();
    }

    private FinancingSourcesSection navigateToFinancingSourcesTab() {
        LogicFrameMatrixSecondaryTabBar tabBar = new LogicFrameMatrixSecondaryTabBar();
        return tabBar.clickOnFinancingSourcesTab();
    }

    private void addCause(String cause) {
        clickOnAddCauseButton();
        setCause(cause);
    }

    private void addEffect(String effect) {
        clickOnAddEffectButton();
        UIMethods.clickOnElement(showEffectsButton);
        setEffect(effect);
    }

    private void addComponent(String component) {
        clickOnAddComponentButton();
        setComponent(component);
    }

    private void addActivity(String activity) {
        clickOnAddActivityButton();
        UIMethods.clickOnElement(showActivitiesButton);
        setActivity(activity);
    }

    private void addEndIndicators(String endIndicators) {
        setEndIndicators(endIndicators);
        clickOnEndIndicatorsPlusButton();
    }

    private void addVerificationMethods(String endVerificationMethods) {
        setVerificationMethods(endVerificationMethods);
        clickOnEndVerificationMethodsPlusButton();
    }

    private void addEndAssumptions(String endAssumptions) {
        setEndAssumptionsTextBox(endAssumptions);
        clickOnEndAssumptionsPlusButton();
    }

    private void addPurposeIndicators(String purposeIndicators) {
        setPurposeIndicators(purposeIndicators);
        clickOnPurposeIndicatorsPlusButton();
    }

    private void setBaseLine(LogicFrameData logicFrameData) {
        BaseLineSection baseLine = clickOnConfigureBaseLineButton(logicFrameData.getPurposeIndicators());
        baseLine.setBaseLineInformation(logicFrameData);
    }

    private void setFinancingSources(LogicFrameData logicFrameData) {
        FinancingSourcesSection financingSources = navigateToFinancingSourcesTab();
        financingSources.setFinancingSourcesInformation(logicFrameData);
    }

    private void addPurposeVerificationMethods(String purposeVerificationMethods) {
        setPurposeVerificationMethods(purposeVerificationMethods);
        clickOnPurposeVerificationMethodsPlusButton();
    }

    private void addPurposeAssumptions(String purposeAssumptions) {
        setPurposeAssumptions(purposeAssumptions);
        clickOnPurposeAssumptionsPlusButton();
    }

    /**
     * Sets the end information including project end details, indicators, verification methods, and assumptions.
     *
     * @param logicFrameData The LogicFrameData object containing logic frame-related information.
     */
    private void setEndInformation(LogicFrameData logicFrameData) {
        setEndOfProject(logicFrameData.getEndProject());
        setEndDetails(logicFrameData.getEndDetails());
        addEndIndicators(logicFrameData.getEndIndicators());
        navigateToVerificationMethodsTab();
        addVerificationMethods(logicFrameData.getEndVerificationMethods());
        navigateToAssumptionsTab();
        addEndAssumptions(logicFrameData.getEndAssumptions());
    }

    /**
     * Sets the purpose information including purpose details, indicators, verification methods, and assumptions.
     *
     * @param logicFrameData The LogicFrameData object containing logic frame-related information.
     */
    private void setPurposeInformation(LogicFrameData logicFrameData) {
        setProjectPurpose(logicFrameData.getPurpose());
        setPurposeDetails(logicFrameData.getPurposeDetails());
        addPurposeIndicators(logicFrameData.getPurposeIndicators());
        setBaseLine(logicFrameData);
        navigateToVerificationMethodsTab();
        addPurposeVerificationMethods(logicFrameData.getPurposeVerificationMethods());
        navigateToAssumptionsTab();
        addPurposeAssumptions(logicFrameData.getPurposeAssumptions());
    }

    /**
     * Sets the activity information including activity detail, verification methods, assumptions, and financing sources.
     *
     * @param logicFrameData The LogicFrameData object containing logic frame-related information.
     */
    private void setActivityInformation(LogicFrameData logicFrameData) {
        clickOnActivity(logicFrameData.getActivity());
        setActivityDetail(logicFrameData.getActivityDetail());
        addVerificationMethods(logicFrameData.getActivityVerificationMethods());
        navigateToSecondAssumptionsTab();
        addVerificationMethods(logicFrameData.getActivityAssumptions());
        setFinancingSources(logicFrameData);
    }

    /**
     * Sets the component information including component detail, verification methods, associated activities, and assumptions.
     *
     * @param logicFrameData The LogicFrameData object containing logic frame-related information.
     */
    private void setComponentInformation(LogicFrameData logicFrameData) {
        clickOnComponent(logicFrameData.getComponent());
        setComponentDetail(logicFrameData.getComponentDetail());
        addVerificationMethods(logicFrameData.getComponentVerificationMethods());
        navigateToActivitiesTab();
        setActivityInformation(logicFrameData);
        navigateToAssumptionsTab();
        addVerificationMethods(logicFrameData.getComponentAssumptions());
    }

    /**
     * Sets the problem tree including core problem, cause, and effect.
     *
     * @param logicFrameData The LogicFrameData object containing logic frame-related information.
     */
    private void setProblemTree(LogicFrameData logicFrameData) {
        setCoreProblem(logicFrameData.getCoreProblem());
        addCause(logicFrameData.getCause());
        addEffect(logicFrameData.getEffect());
    }

    /**
     * Sets the objective tree including general objective, component, and activity.
     *
     * @param logicFrameData The LogicFrameData object containing logic frame-related information.
     */
    private void setObjectiveTree(LogicFrameData logicFrameData) {
        setGeneralObjective(logicFrameData.getGeneralObjective());
        addComponent(logicFrameData.getComponent());
        addActivity(logicFrameData.getActivity());
    }

    /**
     * Sets the logic frame matrix including end information, purpose information, component information, and associated activities.
     *
     * @param logicFrameData The LogicFrameData object containing logic frame-related information.
     */
    private void setLogicFrameMatrix(LogicFrameData logicFrameData) {
        setEndInformation(logicFrameData);
        navigateToPurposeTab();
        setPurposeInformation(logicFrameData);
        navigateToComponentsTab();
        setComponentInformation(logicFrameData);
    }

    /**
     * Sets the annual goals section in the logic frame.
     *
     * @param logicFrameData The LogicFrameData object containing logic frame-related information.
     */
    private void setAnnualGoals(LogicFrameData logicFrameData) {
        IndicatorsSection indicatorSection = clickOnAddIndicatorButton();
        indicatorSection.setIndicatorInformation(logicFrameData);
    }

    /**
     * Waits until the progress spinner icon is visible.
     */
    private void waitUntilProgressSpinnerIconIsVisible() {
        driverWait.until(ExpectedConditions.visibilityOf(progressSpinnerIcon));
    }

    /**
     * Saves the logic frame data.
     *
     * @param logicFrameData The LogicFrameData object containing logic frame-related information.
     * @return The LogicFramePage object after saving the data.
     */
    public LogicFramePage saveLogicFrameData(LogicFrameData logicFrameData) {
        setProblemTree(logicFrameData);
        setObjectiveTree(logicFrameData);
        setLogicFrameMatrix(logicFrameData);
        setAnnualGoals(logicFrameData);
        saveData();
        waitUntilProgressSpinnerIconIsVisible();
        return new LogicFramePage();
    }

}