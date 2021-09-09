package Assignment.week1;

public class FrequencyNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr= {3,4,2,5,1,2,6,3,6,2,4,7,1};
		
		int[] fr=new int[numArr.length];
		
		int visited=-1;
		
		for (int i=0;i<numArr.length;i++)
		{
			int count=1;

			for(int i1=i+1;i1<numArr.length;i1++)
			{
				if (numArr[i]==numArr[i1])
				{
					count++;

					fr[i1]=visited;
				}
			
		}
		if(fr[i]!=visited)

		{
			fr[i]=count;
		}

		}

		for(int i2=0;i2<fr.length;i2++)
		{
			if(fr[i2]!=visited)
				System.out.println(numArr[i2]+"is repeted by"+fr[i2]+"time");

		}
		
	}	}

