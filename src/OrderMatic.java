public class OrderMatic implements Runnable{

    private int OrderNo;
    private final Object LOCK=new Object();

    public OrderMatic() {
        this.OrderNo = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (LOCK){
            this.OrderNo++;
            System.out.println(Thread.currentThread().getName()+" -OrderNo --> "+OrderNo);
        }


    }
    public int getOrderNo(){
        return OrderNo;
    }

    public void setOrderNo(int orderNo) {
        this.OrderNo = orderNo;
    }
}
