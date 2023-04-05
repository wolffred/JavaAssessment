package org.example.VirtualMachineOrganisation.Builder;

import org.example.VirtualMachineOrganisation.Requestor.Requestor;
import org.example.VirtualMachineOrganisation.VM.VM;

public class PCBuilder implements AuthorisingService, SystemBuildService {

    private Requestor requestor;
    int pcBuiltToday;
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
        return b;
    }

    @Override
    public String createNewMachine(VM machine) {
        return null;
    }




    public void buildMachine(Requestor requestor){
        if(iisAuthorised(requestor.getAuthorised() == true)){
            createNewMachine(requestor.getMachineType());
            {
                pcBuiltToday  +=1;
                System.out.println("host20230405" + pcBuiltToday);
                System.out.println(pcBuiltToday);

            }
        }else{
            failedToBuildPc+=1;
            System.out.println(failedToBuildPc);
        }
    };

}
