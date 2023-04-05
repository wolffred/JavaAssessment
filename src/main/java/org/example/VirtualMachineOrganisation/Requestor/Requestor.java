package org.example.VirtualMachineOrganisation.Requestor;

import org.example.VirtualMachineOrganisation.VM.VM;

public class Requestor {
    private String userName;
    private boolean authorised ;
    private VM machineType;


    public Requestor(String userName, boolean authorised, VM machineType) {
        this.userName = userName;
        this.authorised = authorised;
        this.machineType = machineType;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean getAuthorised() {
        return this.authorised;
    }

    public void setAuthorised(boolean authorised) {
        this.authorised = authorised;
    }

    public VM getMachineType() {
        return this.machineType;
    }

    public void setMachineType(VM machineType) {
        this.machineType = machineType;
    }
}
