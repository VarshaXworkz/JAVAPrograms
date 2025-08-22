package arrays;

public class BubbleSort {
	public void bubbleSorting(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int array[]= {9,8,1,3,5,6};
		BubbleSort obj=new BubbleSort();
		
		obj.bubbleSorting(array);
		System.out.println("Sorted Array is:"+array);
		}

}
