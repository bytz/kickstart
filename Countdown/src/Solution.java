import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author bytz
 */
public class Solution {

	/**
	 * @param args the command line arguments
	 * @throws java.io.IOException
	 */
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		Writer writer=new PrintWriter(System.out);
		int T=scanner.nextInt();
		for(int t=0;t<T;t++){
			int N=scanner.nextInt();
			int K=scanner.nextInt();
			int k=K;
			int C=0;
			for(int i=0;i<N;i++){
				int A=scanner.nextInt();
				if(A==K)
					k=K;
				if(A==k)
					k--;
				else
					k=K;
				if(k==0)
					C++;
			}
			writer.write("Case #"+(t+1)+": "+C);
			writer.write(System.lineSeparator());
			writer.flush();
		}
		writer.close();
		scanner.close();
	}

}
