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

    //Setup

    @Mock
    private Requestor requestor;

    @Mock
    private VMBuilder VMBuilder;

    @BeforeEach
    void setup(){
        requestor = mock(Requestor.class);
        VMBuilder = mock(VMBuilder.class);
        requestor1 = new Requestor("Bob", true, new Desktop());
    }

    @Test
    void isAuthorised() {
        assertNotEquals(true, VMBuilder.isAuthorised(requestor1.getUserName()));
    }

    @Test
    void iisAuthorised() {
        VMBuilder.iisAuthorised(requestor1.getAuthorised());
        assertFalse(VMBuilder.iisAuthorised(requestor.getAuthorised()));

    }

    @Test
    void createNewMachine() {
        VMBuilder.createNewMachine(requestor.getMachineType());
        assertEquals("Machine Created", VMBuilder.createNewMachine(requestor1.getMachineType()));
    }

    @Test
    void buildMachine() {
        assertEquals("mds", VMBuilder.buildMachine(requestor1));
    }


    @Test
    void getPcBuiltToday() {
        VMBuilder.buildMachine(requestor);
        int pcsBuilt = VMBuilder.getBuiltToday();
        assertEquals(1, pcsBuilt);

    }

    @Test
    void getFailedToBuildPc() {
    }
}