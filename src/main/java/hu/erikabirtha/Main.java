package hu.erikabirtha;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Ez a TollSystem starter");

        ContollerTollSystem contollerTollSystem = new ContollerTollSystem();
        ViewTollSystem viewTollSystem = new ViewTollSystem(contollerTollSystem);
        ViewModelTollSystem viewModelTollSystem = new ViewModelTollSystem("","", 0, new Date(), new Date(), new Date(), "");
        DisplayTollSystem presenterTollSystem = new PresenterTollSystem(viewTollSystem);
        VignetteAPI InteractorTollSystem = new InteractorTollSystem() ;

        viewTollSystem.showVehicleMotorwayVignetteHistory();
        contollerTollSystem.findVehicleByRegistrationNumber(viewModelTollSystem.registrationNumber);

    }

}