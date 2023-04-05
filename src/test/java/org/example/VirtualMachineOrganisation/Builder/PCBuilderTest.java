package org.example.VirtualMachineOrganisation.Builder;

import org.example.VirtualMachineOrganisation.Requestor.Requestor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
class PCBuilderTest {

    //Setup

    @Mock
    private Requestor requestor;

    @Mock
    private PCBuilder pcBuilder;

    @BeforeEach
    void setup(){
        requestor = mock(Requestor.class);
        pcBuilder = mock(PCBuilder.class);
    }

    @Test
    void isAuthorised() {
    }

    @Test
    void iisAuthorised() {
        pcBuilder.iisAuthorised(requestor.getAuthorised());
        assertFalse(pcBuilder.iisAuthorised(requestor.getAuthorised()));

    }

    @Test
    void createNewMachine() {
        pcBuilder.createNewMachine(requestor.getMachineType());
        assertEquals("Machine Created", pcBuilder.createNewMachine(requestor.getMachineType()));
    }

    @Test
    short buildMachine(Requestor requestor) {

        assertEquals("sds", buildMachine(this.requestor));
        return 0;
    }
}