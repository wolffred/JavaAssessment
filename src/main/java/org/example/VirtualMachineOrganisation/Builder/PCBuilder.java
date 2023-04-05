package org.example.VirtualMachineOrganisation.Builder;

import org.example.VirtualMachineOrganisation.Requestor.Requestor;
import org.example.VirtualMachineOrganisation.VM.VM;

public class PCBuilder implements AuthorisingService, SystemBuildService {

    private Requestor requestor;
    int pcBuiltToday = 000;
    int failedToBuildPc;
    boolean authorised = false;
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
        pcBuiltToday  +=1;
        if(pcBuiltToday == 1){
            String pcBuilt = "001";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(pcBuiltToday == 2){
            String pcBuilt = "002";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(pcBuiltToday == 3){
            String pcBuilt = "003";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(pcBuiltToday == 4){
            String pcBuilt = "004";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(pcBuiltToday == 5){
            String pcBuilt = "005";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(pcBuiltToday == 6){
            String pcBuilt = "007";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(pcBuiltToday == 7){
            String pcBuilt = "007";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(pcBuiltToday == 8){
            String pcBuilt = "008";
            System.out.println("host20230405" + pcBuilt);
        }
        else if(pcBuiltToday == 9){
            String pcBuilt = "001";
            System.out.println("host20230405" + pcBuilt);
        }
        else {
            System.out.println("host20230405" + pcBuiltToday);
        }

        System.out.println(pcBuiltToday + " Virtual Machine(s) built today");
        return "Machine Created";
    }




    public String buildMachine(Requestor requestor){
        if(iisAuthorised(requestor.getAuthorised())){
            createNewMachine(requestor.getMachineType());
            return "Machine built";
        }else{
            failedToBuildPc+=1;
//            System.out.println(failedToBuildPc + " Failed request");
            System.out.println("");
        }
        return "Machine built";
    };

    public int getPcBuiltToday(){
        System.out.print("Number of machines that got built are ");
        return pcBuiltToday;
    }

    public int getFailedToBuildPc(){
        System.out.print("Number of machines that failed to build are ");
        return failedToBuildPc;
    }

}
