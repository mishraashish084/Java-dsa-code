public class Students{
   private String name;
   private int roll;
   private float per;
   public Students(String name,int roll,float per)
   {
    this.name=name;
    this.roll=roll;
    this.per=per;
    
   }
   public String getName()
   {
    return name;
   }
   public int getRoll()
   {
    return roll;
   }
   public float getPercentage()
{
    return per;
}
public void setName(String name)
{
    this.name=name;
}
public void setRoll(int roll)
{
    this.roll=roll;
}
public void setPercentage(float per)
{
    this.roll=roll;
}

}