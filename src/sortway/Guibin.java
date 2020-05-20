package sortway;

public class Guibin {
	public static void main(String[] args) {
		//int arr[]=new int[]{4,3,1,13,2,9,8,6,7,11,5};
		//System.out.println("[1,2,3,4,4]".replace("[", "").replace("]", ""));
		//mergeSort3(arr);
		/*mergeSort4(arr,0,arr.length-1);
		for (int j=0;j<arr.length ; j++) {
			System.out.println(arr[j]);
			
		}*/
	//	System.out.println(System.currentTimeMillis());
	//	System.out.println(System.currentTimeMillis()-(10*60*1000));
		Long aLong=133333l;
		Long l=133333l;
		System.out.println(aLong.equals(l));
		
	}
	//插入  与之前排好的序列比较
	public static void mergeSort(int[] arr) {
		for(int i=1;i<arr.length;i++){
			if(arr[i-1]>arr[i]){
				int j=i-1;
				while(arr[j+1]<arr[j])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					if(j==0){
						break;
					}
					j--;
					
				}
			}
		}
    }
	//简单选择  依次找最小的安顺序方
	public static void mergeSort2(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				int temp;
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
    }
	//冒泡排序 相邻比较 大的往后放
	public static void mergeSort3(int[] arr) {
		for(int i=0;i<Math.sqrt(arr.length);i++){
			for(int j=0;j<arr.length-1-i;j++){
				int temp;
				if(arr[j]>arr[j+1]){
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
    }
	//快速排序  找一个最后一个数做key值  从左到有找比key值大的数  从右到左找 比key小的值 交换    最后arr[left]交换key
	public static void mergeSort4(int[] arr,int left,int right) {
		if(left>=right){
			return;
		}
		int index=dgsort(arr,left,right);
		mergeSort4(arr,left,index-1);
		mergeSort4(arr,index+1,right);
    }
	private static int dgsort(int[] arr,int left,int right){
		int key=arr[right];
		while(left<right){
			while(left<right&&arr[left]<key){
				left++;
			}
			while(left<right&&arr[right]>key){
				right--;
			}
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		}
		
		return left;
	}
	//事物隔离级别
	/*
	 * read_committed
	 * read_uncommitted
	 * reapeattable_read
	 * serializable
	 * 
	 */
}

    