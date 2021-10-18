data class Date(val year:Int=2021, val month:Int=10 , val day:Int=17)
{
    fun Date.leapYear():Boolean{
        return if(this.year%4==0 || this.year%400==0)
            true
        else if (this.year%100==0)
            false
        else
            false
    }
    fun Date.valid():Boolean{
        return !(this.year<0 || this.year>2021 || this.month<0 || this.month>12 || this.day<0 || this.day>31)
    }
}


