public class GoogleBillboard {
public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
public static void main(final String[] args) {
for(int i = 2; i < e.length(); i++){
	String num = e.substring(i,i+10);
	double dNum = Double.parseDouble(num);
	if(isPrime(dNum) == true){
		System.out.println(dNum);
		break;
	}
}
}

	//Finish this function
public boolean isPrime(double dNum){
for(int i = 2; i <= Math.sqrt(dNum); i++)
    if(dNum%i == 0){
      return false;
    }
  return true;
}

