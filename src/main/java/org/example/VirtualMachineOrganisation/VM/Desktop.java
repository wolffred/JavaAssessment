package org.example.VirtualMachineOrganisation.VM;

import org.example.VirtualMachineOrganisation.Requestor.Requestor;

public class Desktop extends VM{

    private String MicrosoftWindowsVersion;
    private String buildNumber;

    private String hostName;

    public Desktop(String hostName, Requestor requestor, int numberOfCPUs, int numberOfRamGb, int hardDiskSize) {
        super(hostName, requestor, numberOfCPUs, numberOfRamGb, hardDiskSize);

        this.MicrosoftWindowsVersion = MicrosoftWindowsVersion;
        this.buildNumber = buildNumber;
    }


    public Desktop() {

    }

}
