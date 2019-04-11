package com.example.codeclan.coursebookingservice.repositories.CustomerRepository;

import com.example.codeclan.coursebookingservice.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomersByCourse(Long id) {
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("bookings", "bookingsAlias");
        cr.add(Restrictions.eq("bookingsAlias.course_id", id));
        result = cr.list();
        return result;
    }
}
