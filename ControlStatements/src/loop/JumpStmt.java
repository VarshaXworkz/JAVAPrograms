package loop;

public class JumpStmt {
	public static void main(String[] args) {
		outerloop:
	for(int i=0;i<=2;i++) {
		innerloop:
		for(int j=0;j<=2;j++) {
			System.out.println(i+" "+j);
			if(i==1&&j==1) {
				break;
				}
			}
		}
		System.out.println("-----------------------------------");
		outerloop:
			for(int i=0;i<=2;i++) {
				innerloop:
				for(int j=0;j<=2;j++) {
					
					if(i==1&&j==1) {
						continue;
						}
					System.out.println(i+" "+j);
					}
				}
}
}
