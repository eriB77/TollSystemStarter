package hu.erikabirtha;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Ez a TollSystem starter");

        ContollerTollSystem contollerTollSystem = new ContollerTollSystem();
        ViewTollSystem viewTollSystem = new ViewTollSystem(contollerTollSystem);
        StorageGatewayType storageGatewayType = new StorageTollSystem();


        DisplayTollSystem presenterTollSystem = new PresenterTollSystem(viewTollSystem);
        VignetteAPI InteractorTollSystem = new InteractorTollSystem(presenterTollSystem, storageGatewayType);
       // StorageTollSystem
        //itt áthívunk az interactorba
        contollerTollSystem.setInteractor(InteractorTollSystem);

        viewTollSystem.showVehicleMotorwayVignetteHistory();
        contollerTollSystem.findVehicleByRegistrationNumber("","", "",
                0, new Date(), new Date(), new Date());


    }

}