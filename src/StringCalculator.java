
public class StringCalculator {

	public static int add(String string) {
		// TODO Auto-generated method stub
		int sum = 0;
		if (string==null){
			return 0;
		}
		String[] split = string.split(","); 
		for (int i = 0; i < split.length; i++){
			if (!split[i].trim().isEmpty()){
				if (Integer.parseInt(split[i])>= 0){
					sum = sum + Integer.parseInt(split[i]);	
				}
			}
		}
		
		return sum;
	}
	
	public static void testException(int pat) throws Exception{
		if (pat == 1){
			throw new Exception("Bad Exception");
		}else{
			throw new Exception("Really Bad Exception");
		}
	}

}
