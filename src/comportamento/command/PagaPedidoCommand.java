package comportamento.command;

public class PagaPedidoCommand implements Comando{
	private Pedido pedido;
	
	public PagaPedidoCommand(Pedido pedido) {
		super();
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		System.out.println("pagando pedido do "+pedido.getCliente());
		pedido.paga();
	}
	
}
