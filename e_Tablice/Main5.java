
public class Main5 {

	public static void main(String[] args) {
int numbers [] = {-1001,-5,-18,-20,-65,-888,-35,-4,-89,-100};
int max = numbers[0];
for(int item: numbers ){
if(item>max) {
max=item;
}
}

System.out.println(max);


	}


}
