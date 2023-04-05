package org.example;

import org.example.VirtualMachineOrganisation.Builder.PCBuilder;
import org.example.VirtualMachineOrganisation.Requestor.Requestor;
import org.example.VirtualMachineOrganisation.VM.Desktop;
import org.example.VirtualMachineOrganisation.VM.VM;

public class Main {
    public static void main(String[] args) {

        Requestor requestor1 = new Requestor("Bob", true, new Desktop());
        Requestor requestor2 = new Requestor("Bib", false, new Desktop());

        PCBuilder pcbuilder = new PCBuilder();

        pcbuilder.buildMachine(requestor1);
        pcbuilder.buildMachine(requestor1);
        pcbuilder.buildMachine(requestor2);
        System.out.println(pcbuilder.getPcBuiltToday());
        System.out.println(pcbuilder.getFailedToBuildPc());
        //System.out.println("Hello world!");
    }
}