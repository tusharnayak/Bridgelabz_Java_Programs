package com.Bridgelabz.DataStructure;

public class HashMap {
	Node arr[] = new Node[11];

	public void method(int data) {
		Node n = new Node();
		n.data = data;
		n.next = null;
		// DS_utility<HashMap> hs=new DS_utility<HashMap>();
		int index = data % 11;
		if (arr[index] == null) {
			arr[index] = n;
		} else {
			Node temp = arr[index];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}

	void diplay() {
		for (int i = 0; i < arr.length; i++) {
			Node temp = arr[i];
			if (temp != null) {
				System.out.print("Remainder " + i + " : ");
				while (temp != null) {
					System.out.print(temp.data + " ");
					temp = temp.next;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		HashMap obj = new HashMap();
		obj.method(77);
		obj.method(44);
		obj.method(55);
		obj.method(26);
		obj.method(93);
		obj.method(17);
		obj.method(31);
		obj.method(20);
		obj.method(54);
		obj.diplay();

	}
}
