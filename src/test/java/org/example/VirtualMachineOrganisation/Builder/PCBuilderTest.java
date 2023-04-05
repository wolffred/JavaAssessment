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
class PCBuilderTest {

    private Requestor requestor1;

    //Setup

    @Mock
    private Requestor requestor;

    @Mock
    private PCBuilder pcBuilder;

    @BeforeEach
    void setup(){
        requestor = mock(Requestor.class);
        pcBuilder = mock(PCBuilder.class);
        requestor1 = new Requestor("Bob", true, new Desktop());
    }

    @Test
    void isAuthorised() {
        assertNotEquals(true, pcBuilder.isAuthorised(requestor1.getUserName()));
    }

    @Test
    void iisAuthorised() {
        pcBuilder.iisAuthorised(requestor1.getAuthorised());
        assertFalse(pcBuilder.iisAuthorised(requestor.getAuthorised()));

    }

    @Test
    void createNewMachine() {
        pcBuilder.createNewMachine(requestor.getMachineType());
        assertEquals("Machine Created", pcBuilder.createNewMachine(requestor1.getMachineType()));
    }

    @Test
    void buildMachine() {
        assertEquals("mds", pcBuilder.buildMachine(requestor1));
    }


    @Test
    void getPcBuiltToday() {
        pcBuilder.buildMachine(requestor1);
        int pcsBuilt = pcBuilder.getPcBuiltToday();
        assertEquals(1, pcsBuilt);

    }

    @Test
    void getFailedToBuildPc() {
    }
}