package org.example.VirtualMachineOrganisation.Builder;

import org.example.VirtualMachineOrganisation.Requestor.Requestor;

public interface AuthorisingService {

    public Requestor requestor = null;
    boolean isAuthorised(String user);
}
