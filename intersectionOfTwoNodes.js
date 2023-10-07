 let node1 = head1;
    while (node1 != null) {
        let node2 = head2;
        while (node2 != null) {
            if (node1 === node2) {
                return node1.data;
            }
            node2 = node2.next;
        }
        node1 = node1.next;
    }
    return -1; // return -1 if no intersection found
}
