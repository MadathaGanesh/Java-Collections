public class Phone implements Comparable<Phone>{
    private String contactName;
    private String contactNumber;

    public Phone(String contactName,String contactNumber){
        this.contactName=contactName;
        this.contactNumber=contactNumber;
    }

    // Contact Names and Numbers after Sorting acc to ContactName ...............
 /*   @Override
    public int compareTo(Phone obj){
        if (this.contactName.compareTo(obj.contactName)==0){
            return 0;
        }else if(this.contactName.compareTo(obj.contactName)>0){
            return 1;
        }else{
            return -1;
        }
    }*/


    // Contact Names and Numbers after Sorting acc to ContactNumber ...............
    @Override
    public int compareTo(Phone obj){
        if (this.contactNumber.compareTo(obj.contactNumber)==0){
            return 0;
        } else if (this.contactNumber.compareTo(obj.contactNumber)>0) {
            return 1;
        }else{
            return -1;
        }
    }

    public String getContactName(){
        return contactName;
    }
    public String getContactNumber(){
        return contactNumber;
    }
}
