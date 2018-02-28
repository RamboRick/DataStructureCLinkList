package list;

public class LockDList extends DList {
	
	protected LockDListNode newNode(Object item, DListNode prev, DListNode next) {
	    return new LockDListNode(item, prev, next);
	  }
	
	public void lockNode(DListNode node){
		((LockDListNode)node).isLocked = true;
	}
	
	public void remode(DListNode node){
		if (((LockDListNode)node).isLocked == false){
			super.remove(node);
		}
	}
	
}
