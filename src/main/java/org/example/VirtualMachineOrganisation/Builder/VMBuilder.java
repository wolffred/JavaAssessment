package org.example.VirtualMachineOrganisation.Builder;

import org.example.VirtualMachineOrganisation.Requestor.Requestor;
import org.example.VirtualMachineOrganisation.VM.VM;

import java.util.HashMap;
import java.util.Map;

public class VMBuilder implements AuthorisingService, SystemBuildService {

    private Requestor requestor;
    int BuiltToday = 000;
    int totalFailedBuildsForDay;
    boolean authorised = false;

    Map<String, Map<String, Integer>> users = new HashMap<>();
    @Override
    public boolean isAuthorised(String user) {
        if (requestor.getUserName() == user){
            if(requestor.getAuthorised() == true){
                authorised = true;
            }else{
                authorised = false;
            }
        }
        return authorised;
    }


    public boolean iisAuthorised( boolean b) {
        authorised = b;
        return authorised;
    }

    @Override
    public String createNewMachine(VM machine) {
        BuiltToday +=1;
        if(BuiltToday == 1){
            String pcBuilt = "001";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(BuiltToday == 2){
            String pcBuilt = "002";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(BuiltToday == 3){
            String pcBuilt = "003";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(BuiltToday == 4){
            String pcBuilt = "004";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(BuiltToday == 5){
            String pcBuilt = "005";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(BuiltToday == 6){
            String pcBuilt = "007";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(BuiltToday == 7){
            String pcBuilt = "007";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(BuiltToday == 8){
            String pcBuilt = "008";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(BuiltToday == 9){
            String pcBuilt = "001";
            System.out.println("host20230405" + pcBuilt);
        }
        else {
            System.out.println("host20230405" + BuiltToday);
        }

        System.out.println(BuiltToday + " Virtual Machine(s) built today");
        return "Machine Created";
    }




    public String buildMachine(Requestor requestor){
        if(iisAuthorised(requestor.getAuthorised())){
            createNewMachine(requestor.getMachineType());
            return "Machine built";
        }else{
            totalFailedBuildsForDay +=1;
//            System.out.println(failedToBuildPc + " Failed request");
            System.out.println("");
        }
        return "Machine built";
    };

    public int getBuiltToday(){
        System.out.print("Number of machines that got built are ");
        return BuiltToday;
    }

    public int getTotalFailedBuildsForDay(){
        System.out.print("Number of machines that failed to build are ");
        return totalFailedBuildsForDay;
    }

}
