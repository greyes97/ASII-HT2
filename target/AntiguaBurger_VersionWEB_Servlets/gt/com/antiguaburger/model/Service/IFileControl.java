package webapp.gt.com.antiguaburger.model.Service;

import webapp.gt.com.antiguaburger.model.Entity.OrderEntity;

import java.io.IOException;

public interface IFileControl {
    public void createFile(OrderEntity order) throws IOException;
}
