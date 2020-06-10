
public class Sum {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[args.length - 1]);
		
		for(int i = 0; i < args.length - 2; i++){
			for(int j = i + 1; j < args.length - 1; j++){
				if(Integer.parseInt(args[i]) + Integer.parseInt(args[j]) == n){
					System.out.println(args[i] + " " + args[j]);
				}
			}
		}
	}

}
