package org.example.VirtualMachineOrganisation.VM;

import org.example.VirtualMachineOrganisation.Requestor.Requestor;

public class Server extends VM {

    private String LinuxDistributionName;
    private int maajorNumberOfDistribution;
    private String kernelversionNumber;
    private String hostName;




    public Server(String hostName, Requestor requestor, int numberOfCPUs, int numberOfRamGb, int hardDiskSize) {
        super(hostName, requestor, numberOfCPUs, numberOfRamGb, hardDiskSize);


    }

}
