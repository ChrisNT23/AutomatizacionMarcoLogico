@UI @Inversion @LogicFrame
Feature: Logical Frame

  @CreateProjectWithLogicFrame
  Scenario Outline: A user with proper role should be able to save data in the Logic Frame page from a new project
    Given the user navigates to the login page
    And the "external" user with the "<User Role>" role and the "<User Area>" area logs in with defined credentials
    And the user navigates to the new project page via url link
    And the user creates a project with the following data
      | name   | investmentPhase    | management   | coverage   | investmentType    | interventionSubSector    | totalInvestment    | investmentGuideline    | startDate    | endDate    | requestType    | participants   | emblematic   | endorsement   | environmentalSheet    | binationalCooperation    | manager   | responsible   | responsiblePosition    | email   | additionalEmail    | phoneNumber    | extension   | highestAuthorityResponsible     | highestAuthorityEmail     | product   | productDetail    |
      | <Name> | <Investment Phase> | <Management> | <Coverage> | <Investment Type> | <Intervention SubSector> | <Total Investment> | <Investment Guideline> | <Start Date> | <End Date> | <Request Type> | <Participants> | <Emblematic> | <Endorsement> | <Environmental Sheet> | <Binational Cooperation> | <Manager> | <Responsible> | <Responsible Position> | <Email> | <Additional Email> | <Phone Number> | <Extension> | <Highest Authority Responsible> | <Highest Authority Email> | <Product> | <Product Detail> |
    When the user navigates to the logic frame page
    And the user saves the logic frame information with the following data
      | coreProblem    | cause   | effect   | generalObjective    | component   | activity   | endProject    | endDetails    | endIndicators    | endVerificationMethods     | endAssumptions    | purpose   | purposeDetails    | purposeIndicators    | quantitativeIndicator    | qualitativeIndicator    | measuringUnit    | indicatorWeighting    | otherUnits    | quantity   | horizonDate    | purposeVerificationMethods     | purposeAssumptions    | componentDetail    | componentVerificationMethods     | activityDetail    | activityVerificationMethods     | activityAssumptions    | financingSource    | spendingGroup    | budgetItem    | unitCost    | quantityUnit    | fiscalPeriod    | componentAssumptions    | indicator   | measuringUnitIndicator     | baseLine    | goal   | weighting   | yearValue    |
      | <Core Problem> | <Cause> | <Effect> | <General Objective> | <Component> | <Activity> | <End Project> | <End Details> | <End Indicators> | <End Verification Methods> | <End Assumptions> | <Purpose> | <Purpose Details> | <Purpose Indicators> | <Quantitative Indicator> | <Qualitative Indicator> | <Measuring Unit> | <Indicator Weighting> | <Other Units> | <Quantity> | <Horizon Date> | <Purpose Verification Methods> | <Purpose Assumptions> | <Component Detail> | <Component Verification Methods> | <Activity Detail> | <Activity Verification Methods> | <Activity Assumptions> | <Financing Source> | <Spending Group> | <Budget Item> | <Unit Cost> | <Quantity Unit> | <Fiscal Period> | <Component Assumptions> | <Indicator> | <Measuring Unit Indicator> | <Base Line> | <Goal> | <Weighting> | <Year Value> |
    Then the logic frame information should be saved
    Examples:
      | User Role | User Area  | Name              | Investment Phase | Management | Coverage | Investment Type | Intervention SubSector | Total Investment | Investment Guideline                          | Start Date | End Date | Request Type | Participants | Emblematic | Endorsement | Environmental Sheet | Binational Cooperation | Manager | Responsible  | Responsible Position | Email              | Additional Email    | Phone Number | Extension | Highest Authority Responsible | Highest Authority Email | Product  | Product Detail    | Core Problem | Cause        | Effect   | General Objective | Component      | Activity      | End Project      | End Details      | End Indicators  | End Verification Methods    | End Assumptions   | Purpose   | Purpose Details        | Purpose Indicators | Quantitative Indicator | Qualitative Indicator | Measuring Unit | Indicator Weighting | Other Units    | Quantity | Horizon Date | Purpose Verification Methods | Purpose Assumptions | Component Detail   | Component Verification Methods | Activity Detail   | Activity Verification Methods | Activity Assumptions | Financing Source  | Spending Group | Budget Item  | Unit Cost | Quantity Unit | Fiscal Period | Component Assumptions | Indicator | Measuring Unit Indicator | Base Line | Goal | Weighting | Year Value |
      | admin     | presidency | Proyecto 03/01/24 | Programa         | Estado     | Cantonal | Servicios       | Administración Deporte | 200              | Infraestructura y equipamiento de uso militar | 2024/1/7   | 2024/1/9 | Prioridad    | No           | No         | No          | No                  | No                     | No      | Lionel Messi | Tester               | liomessi@gmail.com | liomessi2@gmail.com | 123456789    | 00000     | Andres Lopez                  | anderslopez@gmail.com   | Cereales | Cereales Chocapic | Falta de luz | Corte de luz | Poca luz | Mejorar la luz    | Componente uno | Actividad uno | Fin del Proyecto | Detalles del fin | Indicadores fin | Metodos de verificacion fin | Supuestos del fin | Proposito | Detalles del proposito | indicador uno      | 10                     | Indicador cualitativo | Contrato       | 2                   | Otras unidades | 2        | 2024/1/8     | Medios proposito             | Supuestos proposito | Detalle componente | Medios componente              | Detalle Actividad | Medios actividad              | Supuestos actividad  | Recursos Fiscales | Obras Publicas | Agua Potable | 10        | 20            | 2024/1        | Supuesto componente   | Indic one | Unidad                   | 122       | 12   | 10        | 120        |

  @SaveLogicFrameFromProjectCreated
  Scenario Outline: A user with proper role should be able to save data in the Logic Frame page from a project already created
    Given the user navigates to the login page
    And the "external" user with the "<User Role>" role and the "<User Area>" area logs in with defined credentials
    And the user navigates to the projects visualization page via url link
    And the user enters to the project with the name "<Project Name>"
    When the user navigates to the logic frame page
    And the user saves the logic frame information with the following data
      | coreProblem    | cause   | effect   | generalObjective    | component   | activity   | endProject    | endDetails    | endIndicators    | endVerificationMethods     | endAssumptions    | purpose   | purposeDetails    | purposeIndicators    | quantitativeIndicator    | qualitativeIndicator    | measuringUnit    | indicatorWeighting    | otherUnits    | quantity   | horizonDate    | purposeVerificationMethods     | purposeAssumptions    | componentDetail    | componentVerificationMethods     | activityDetail    | activityVerificationMethods     | activityAssumptions    | financingSource    | spendingGroup    | budgetItem    | unitCost    | quantityUnit    | fiscalPeriod    | componentAssumptions    | indicator   | measuringUnitIndicator     | baseLine    | goal   | weighting   | yearValue    |
      | <Core Problem> | <Cause> | <Effect> | <General Objective> | <Component> | <Activity> | <End Project> | <End Details> | <End Indicators> | <End Verification Methods> | <End Assumptions> | <Purpose> | <Purpose Details> | <Purpose Indicators> | <Quantitative Indicator> | <Qualitative Indicator> | <Measuring Unit> | <Indicator Weighting> | <Other Units> | <Quantity> | <Horizon Date> | <Purpose Verification Methods> | <Purpose Assumptions> | <Component Detail> | <Component Verification Methods> | <Activity Detail> | <Activity Verification Methods> | <Activity Assumptions> | <Financing Source> | <Spending Group> | <Budget Item> | <Unit Cost> | <Quantity Unit> | <Fiscal Period> | <Component Assumptions> | <Indicator> | <Measuring Unit Indicator> | <Base Line> | <Goal> | <Weighting> | <Year Value> |
    Then the logic frame information should be saved
    Examples:
      | User Role | User Area  | Project Name         | Core Problem | Cause        | Effect   | General Objective | Component      | Activity      | End Project      | End Details      | End Indicators  | End Verification Methods    | End Assumptions   | Purpose   | Purpose Details        | Purpose Indicators | Quantitative Indicator | Qualitative Indicator | Measuring Unit | Indicator Weighting | Other Units    | Quantity | Horizon Date | Purpose Verification Methods | Purpose Assumptions | Component Detail   | Component Verification Methods | Activity Detail   | Activity Verification Methods | Activity Assumptions | Financing Source  | Spending Group | Budget Item  | Unit Cost | Quantity Unit | Fiscal Period | Component Assumptions | Indicator | Measuring Unit Indicator | Base Line | Goal | Weighting | Year Value |
      | admin     | presidency | Ubicacion geografica | Falta de luz | Corte de luz | Poca luz | Mejorar la luz    | Componente uno | Actividad uno | Fin del Proyecto | Detalles del fin | Indicadores fin | Metodos de verificacion fin | Supuestos del fin | Proposito | Detalles del proposito | indicador uno      | 10                     | Indicador cualitativo | Contrato       | 2                   | Otras unidades | 2        | 2023/12/26   | Medios proposito             | Supuestos proposito | Detalle componente | Medios componente              | Detalle Actividad | Medios actividad              | Supuestos actividad  | Recursos Fiscales | Obras Publicas | Agua Potable | 10        | 20            | 2024/1        | Supuesto componente   | Indic one | Unidad                   | 122       | 12   | 10        | 120        |