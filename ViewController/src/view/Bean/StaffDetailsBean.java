package view.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.input.RichInputFile;

import oracle.binding.BindingContainer;

import oracle.binding.OperationBinding;

import oracle.jbo.domain.BlobDomain;

import org.apache.myfaces.trinidad.model.UploadedFile;

public class StaffDetailsBean {
    private RichInputFile myInputFileComponent;
    public StaffDetailsBean() {
    }

    public void StaffImgUpload(ValueChangeEvent valueChangeEvent) {
        try
        {
          UploadedFile file = (UploadedFile) valueChangeEvent.getNewValue();
          BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
          DCIteratorBinding iter = (DCIteratorBinding) bindings.get("StaffView1Iterator");
          iter.getCurrentRow().setAttribute("Photo", newBlobDomainForInputStream(file.getInputStream()));
          OperationBinding op = bindings.getOperationBinding("Commit");
          op.execute();

          FacesContext context = FacesContext.getCurrentInstance();
          context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Image Uploaded Successfully..", null));
          getMyInputFileComponent().resetValue();

        }
        catch (Exception e)
        {
          // TODO: Add catch code
          e.printStackTrace();
        }
        
        }
        
        private BlobDomain newBlobDomainForInputStream(InputStream in) throws SQLException, IOException {
          BlobDomain b = new BlobDomain();
          OutputStream out = b.getBinaryOutputStream();
          writeInputStreamToOutputStream(in, out);
          in.close();
          out.close();
          return b;
        }
        
        private void writeInputStreamToOutputStream(InputStream in, OutputStream out) throws IOException {
          byte[] buffer = new byte[8192];
          int bytesRead = 0;
          while ((bytesRead = in.read(buffer, 0, 8192)) != -1) {
              out.write(buffer, 0, bytesRead);
          }
        }

        public void setMyInputFileComponent(RichInputFile myInputFileComponent)
        {
        this.myInputFileComponent = myInputFileComponent;
        }

        public RichInputFile getMyInputFileComponent()
        {
        return myInputFileComponent;
        }

    public String SaveStaff() {
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        OperationBinding op = bindings.getOperationBinding("Commit");
        op.execute();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Staff Data Saved Sucessfully..", null));
        return null;
    }
}
