public class FindPeakElement {
	
	public int findPeakElement(int[] num) {
		int size = num.length;
		if(size==1)return 0;
		if(num[0]>num[1])return 0;
		if(num[size-1]>num[size-2])return size-1;
		return binarySerch(0,size-1,num);       
	 }
	 
	public int binarySerch(int start,int end,int[] arr){
		int mid = (start+end)/2;
		if(mid == start||mid == end){
			if(arr[start]>arr[end]){
				return start;
			}else{
				return end;
			}
		}
		if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
			return mid;
		}else if(arr[mid]<arr[mid-1]){
			return binarySerch(start,mid-1,arr);
		}else if(arr[mid]<arr[mid+1]){
			return binarySerch(mid+1,end,arr);
		}
		return 0;
	}
}
