package comportamento.command;
public class ConcluiPedidoComand implements Comando{
	private Pedido pedido;
	
	public ConcluiPedidoComand(Pedido pedido) {
		super();
		this.pedido = pedido;
	}

	@Override
	public void executa() {
		System.out.println("concluindo pedido do "+pedido.getCliente());
		pedido.finaliza();
	}

}
