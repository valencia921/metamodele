package diagrama.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;

import diagrama.model.ModelFactoryModel;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import javax.inject.Inject;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Group;



public class GeneradorView extends ViewPart {
	public GeneradorView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(null);
		
		Group grpDeModeloA = new Group(composite, SWT.NONE);
		grpDeModeloA.setText("De Modelo a Modelo");
		grpDeModeloA.setBounds(24, 48, 528, 82);
		
		Button btnNewButton = new Button(grpDeModeloA, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ModelFactoryModel mfm = ModelFactoryModel.getInstance();
				mfm.generarModelToModel();
			}
		});
		btnNewButton.setBounds(10, 47, 325, 25);
		btnNewButton.setText("Generador de M2M");
		
		Group grpDeModeloA_1 = new Group(composite, SWT.NONE);
		grpDeModeloA_1.setText("De modelo a texto");
		grpDeModeloA_1.setBounds(10, 190, 542, 82);
		
		Button btnNewButton_1 = new Button(grpDeModeloA_1, SWT.NONE);
		btnNewButton_1.setBounds(76, 47, 325, 25);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_1.setText("Generador de M2T");
		
	}


	private void fillLocalToolBar(IToolBarManager manager) {
	
	}


	@Override
	public void setFocus() {
		
	}
}
