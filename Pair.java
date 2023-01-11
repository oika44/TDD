package TDD;
 class Pair {
	 private String from;
	 private String to;
	 Pair(String from, String to) {
		 this.from = from;
		 this.to = to;
	 }
	 public boolean equals(Object,Object) {
		 Pair pair = (Pair)object;
		 return from.contentEquals(pair.from)&& to.equals(pair.to);
	 }
	 public int hashCode() {
		 return 0;
	 }
 }