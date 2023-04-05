package org.example.VirtualMachineOrganisation.VM;

import org.example.VirtualMachineOrganisation.Requestor.Requestor;

public  abstract class VM {
    private String hostName;
    private String requestor;
    private int numberOfCPUs;
    private int numberOfRamGb;
    private int hardDiskSize;


    public VM(String hostName, Requestor requestor, int numberOfCPUs, int numberOfRamGb, int hardDiskSize) {
        this.hostName = "host20230405";
        this.requestor = requestor.getUserName();
        this.numberOfCPUs = numberOfCPUs;
        this.numberOfRamGb = numberOfRamGb;
        this.hardDiskSize = hardDiskSize;
    }

    public VM(){

    }


    public String getHostName() {
        return this.hostName ;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getRequestor() {
        return this.requestor;
    }

    public void setRequestor(Requestor requestor) {
        this.requestor = requestor.getUserName();
    }

    public int getNumberOfCPUs() {
        return this.numberOfCPUs;
    }

    public void setNumberOfCPUs(int numberOfCPUs) {
        this.numberOfCPUs = numberOfCPUs;
    }

    public int getNumberOfRamGb() {
        return this.numberOfRamGb;
    }

    public void setNumberOfRamGb(int numberOfRamGb) {
        this.numberOfRamGb = numberOfRamGb;
    }

    public int getHardDiskSize() {
        return this.hardDiskSize;
    }

    public void setHardDiskSize(int hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

}
