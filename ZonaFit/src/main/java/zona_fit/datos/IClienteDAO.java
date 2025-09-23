package zona_fit.datos;
import  zona_fit.dominio.Cliente;
import java.util.List;

public interface IClienteDAO {
    List<Cliente> listarCliente();
    boolean buscarClientePorId(Cliente cliente);
    boolean agregarCliente(Cliente cliente);
    boolean modificarClientePorId(Cliente cliente);
    boolean eliminarClientePorId(Cliente cliente);
}
