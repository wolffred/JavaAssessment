package org.example.VirtualMachineOrganisation.Builder;

import org.example.VirtualMachineOrganisation.Requestor.Requestor;
import org.example.VirtualMachineOrganisation.VM.Desktop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class VMBuilderTest {

    private Requestor requestor1;

    private VMBuilder pcbuilder1;

    //Setup

    @Mock
    private Requestor requestor;

    @Mock
    private VMBuilder VMBuilder;

    @BeforeEach
    void setup(){
        requestor = mock(Requestor.class);
        VMBuilder = mock(VMBuilder.class);
        pcbuilder1 = new VMBuilder();
        requestor1 = new Requestor("Bob", true, new Desktop());
    }

    @Test
    void isAuthorised_when_true() {
        pcbuilder1.requestor = requestor1;
        assertTrue(pcbuilder1.isAuthorised(requestor1.getUserName()));
    }

    @Test
    void isAuthorised_When_False() {
        VMBuilder.iisAuthorised(requestor1.getAuthorised());
        assertFalse(VMBuilder.iisAuthorised(requestor.getAuthorised()));

    }

    @Test
    void createNewMachine() {
        pcbuilder1.createNewMachine(requestor.getMachineType());
        assertEquals("Machine Created", pcbuilder1.createNewMachine(requestor1.getMachineType()));
    }

    @Test
    void buildMachine() {
        assertEquals("Machine built", pcbuilder1.buildMachine(requestor1));
    }


    @Test
    void getPcBuiltToday() {
        pcbuilder1.buildMachine(requestor1);
        int pcsBuilt = pcbuilder1.getBuiltToday();
        assertEquals(1, pcsBuilt);

    }

    @Test
    void getFailedToBuildPc() {
        pcbuilder1.buildMachine(requestor1);
        int pcsBuilt = pcbuilder1.getTotalFailedBuildsForDay();
        assertEquals(0, pcsBuilt);
    }
}