package goods;

public class GoodsApp {
	public static void main( String[] args ) {
		
		Goods camera = new Goods();
		
		camera.setName( "Nikon" );
		camera.setPrice( 400000 );
		camera.setCountSold( 50 );
		camera.setCountStock( 30 );
		
		System.out.println( "상품이름:" + camera.getName() );
	}
}
