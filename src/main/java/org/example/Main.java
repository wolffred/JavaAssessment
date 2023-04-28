package org.example;

import org.example.VirtualMachineOrganisation.Builder.VMBuilder;
import org.example.VirtualMachineOrganisation.Requestor.Requestor;
import org.example.VirtualMachineOrganisation.VM.Desktop;
import org.example.VirtualMachineOrganisation.VM.Server;

public class Main {
    public static void main(String[] args) {

        Requestor requestor1 = new Requestor("Bob", true, new Desktop());
        Requestor requestor2 = new Requestor("Bib", false, new Server());

        VMBuilder pcbuilder = new VMBuilder();

        //System.out.println(pcbuilder.buildMachine(requestor1));
        pcbuilder.buildMachine(requestor1);
        pcbuilder.buildMachine(requestor2);
        System.out.println(pcbuilder.getBuiltToday());
        System.out.println(pcbuilder.getTotalFailedBuildsForDay());
        //System.out.println("Hello world!");
    }
}