package org.example.ecom.gateway;
import org.example.ecom.dto.FakeStoreCartDTO;
import java.io.IOException;
import java.util.List;

public interface ICartGateway {

    List<FakeStoreCartDTO> getCart () throws IOException;
}
