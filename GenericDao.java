interface GenericDao<E,K> { //entity, key
    add(E entity) {}
    /*List<E>*/ list() {}
    /*E*/ find(K key) {}
    update(E entity){}
    remove(K key){}
}